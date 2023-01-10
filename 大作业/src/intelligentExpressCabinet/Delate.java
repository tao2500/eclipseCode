package intelligentExpressCabinet;

public class Delate {
	public void delateOnPickUpCode(NoDe n){
		Dbutil db = new Dbutil();
		db.delateOnPickUpCode(n);
	}
	
	public void delateOnTelephone(NoDe n){
		Dbutil db = new Dbutil();
		db.delateOnTelephone(n);
	}

}
