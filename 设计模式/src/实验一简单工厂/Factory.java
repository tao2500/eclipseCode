package ʵ��һ�򵥹���;

public class Factory {
	public static Game getGame(String s){
		Game g = null;
		if(s.equals("EasyPeopleAndPeople")){
			g = new EasyPeopleAndPeople();
		}else if(s.equals("DifficultyPeopleAndPeople")){
			g = new DifficultyPeopleAndPeople();
		}else if(s.equals("DifficultyPeopleAndComputer")){
			g = new DifficultyPeopleAndComputer();
		}else if(s.equals("EasyPeopleAndComputer")){
			g = new EasyPeopleAndComputer();
		}
		return g;
	}

}
