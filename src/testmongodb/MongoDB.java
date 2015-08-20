package testmongodb;

import com.mongodb.Mongo;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.List;
import java.util.Set;

import org.bson.Document;

import static java.util.concurrent.TimeUnit.SECONDS;
public class MongoDB {
	public void Test(){
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		
		MongoDatabase db = mongoClient.getDatabase("mydb");
		MongoCollection<Document> collection = db.getCollection("testData");
		Document doc = new Document("name", "MongoDB")
        .append("type", "database")
        .append("count", 1)
        .append("info", new Document("x", 203).append("y", 102));
		
		collection.insertOne(doc);
//		collection.drop();


	}
	
	public static void main(String []args){
		MongoDB md = new MongoDB();
		md.Test();
	}
	
}
