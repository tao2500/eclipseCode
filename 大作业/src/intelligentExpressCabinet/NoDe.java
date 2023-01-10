package intelligentExpressCabinet;

public class NoDe<T> {
	private T name;
	private T telephone;
	private T entrytime;
	private T pickupcode;
	private T size;
	public NoDe next;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getTelephone() {
		return telephone;
	}
	public void setTelephone(T telephone) {
		this.telephone = telephone;
	}
	public T getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(T entrytime) {
		this.entrytime = entrytime;
	}
	public T getPickupcode() {
		return pickupcode;
	}
	public void setPickupcode(T pickupcode) {
		this.pickupcode = pickupcode;
	}
	public T getSize() {
		return size;
	}
	public void setSize(T size) {
		this.size = size;
	}
	
	
	public NoDe(T name,T telephone,T entrytime,T pickupcode,T size,NoDe next){
		this.setName(name);
		this.setTelephone(telephone);
		this.setEntrytime(entrytime);
		this.setPickupcode(pickupcode);
		this.setSize(size);
		this.next=next;
	}
	public NoDe(){
		this(null,null,null,null,null,null);
	}
	public NoDe(T obj[],NoDe next){
		this.setName(obj[1]);
		this.setTelephone(obj[2]);
		this.setEntrytime(obj[3]);
		this.setPickupcode(obj[4]);
		this.setSize(obj[5]);
		this.next=next;
	}
	public String toStrisng() {
		NoDe<T> old=this;
		String str=this.getClass().getName()+"(";
		if(old.pickupcode!=null)
			str=str+old.getName()+"  "+old.getTelephone()+"  "+old.getEntrytime()+"  "+old.getPickupcode()+"  "+old.getSize();
		return str+")";
	}
	public boolean isEmpty() {
		return this.getPickupcode()==null;
	}
}
