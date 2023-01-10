package intelligentExpressCabinet;

public class Write {
	public Write(NoDe n){
		Dbutil db = new Dbutil();
		db.add(n);
	}
}