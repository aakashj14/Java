package player;

public class player {
	
	String name;
    String team;
    int score;
    
    player(String name,String team,int score){
    	
    	this.name=name;
    	this.team=team;
    	this.score=score;
   
    }
    void getscore(int points) {
    	score=score+points;
    	
    	System.out.println("Indian player "+name+" score in a  match "+score+" against "+team);
    	
    }
    public static void main(String[] args) {
    	player p1=new player("aakash","austraila",123);
    	p1.getscore(10);
    }
    
    

}

