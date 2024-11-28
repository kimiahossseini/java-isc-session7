package json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class readjson {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File myfile=new File("Account.json");
		ObjectMapper objectmapper=new ObjectMapper();
//****************************************************************************************
//--------The TypeReference<List<Account>> tells Jackson the JSON should be deserialized into a List 
//------where each element is an Account object.
		
		List<Account> accounts=objectmapper.readValue(myfile, new TypeReference<List<Account>>() {});
		
		accounts.forEach(t -> System.out.println(t));
	}

}
