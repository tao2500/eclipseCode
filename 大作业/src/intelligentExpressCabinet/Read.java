package intelligentExpressCabinet;

public class Read {

	public NoDe Read (){
		Dbutil db = new Dbutil();
		NoDe nd = db.exportData();
		return nd;
	}
	
	public int[][] Readlattice(int[][] lattice){
		SinglyList sl = new SinglyList();
		NoDe<String> n = sl.head;
		int big = 0;
		int medium = 0;
		int small = 0;
		for(;n.getSize()!=null;n=n.next){
			if("大格".equals(n.getSize())){
				big+=1;
			}else if("中格".equals(n.getSize())){
				medium+=1;
			}else if("小格".equals(n.getSize())){
				small+=1;
			}
		}
		lattice[1][0] = big;
		lattice[1][1] = medium;
		lattice[1][2] = small;
		return lattice;
	}
	
	public int getTaken(String PickUpCode){
		int taken = 0;//未取快递数量
		taken = new Dbutil().lookupOnPickUpCode(PickUpCode);
		return taken;
	}
}
