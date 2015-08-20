package Database;

import org.bson.Document;

import DAO.CarInfo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import constant.Constant;

public class InsertData {
	private String database = Constant.database; 
	private String collection = Constant.collection;
	private MongoDatabase db;
	private MongoCollection<Document> coll;
	public InsertData(){
		
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		this.db = mongoClient.getDatabase(database);
		this.coll = db.getCollection(collection);
	}
	
	public void InsertIntoDB(CarInfo carinfo){
		 double price = carinfo.getPrice();
		 String engine = carinfo.getEngine();
		 double mileage = carinfo.getMileage();
		 String name = carinfo.getName();
		 int year = carinfo.getYear();
		 String color = carinfo.getColor();
		 int doorCount = carinfo.getDoorCount();
		 String driveTrain = carinfo.getDriveTrain();
		 String bodyStyle = carinfo.getBodyStyle();
		 String transmission = carinfo.getTransmission();
		 String image = carinfo.getImage();
		 
		Document doc = new Document("price", price)
        .append("engine", engine)
        .append("mileage", mileage)
        .append("name", name)
        .append("year", year) 
        .append("color", color)
        .append("doorCount", doorCount) 
        .append("driveTrain", driveTrain)
        .append("bodyStyle", bodyStyle) 
        .append("transmission", transmission)
        .append("image", image);
		
		coll.insertOne(doc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
