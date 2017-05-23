import java.util.*;
import java.awt.Polygon;
public class Player{
private Location playerLoc;
private boolean isJump = false;
private Map myMap;

public Player (Location loc, boolean jump, Map m){
playerLoc = loc;
isJump = jump;
myMap = m;

}

public void move() {
for(int lcv = 0; lcv >= 0; lcv++){
	//calls controller to check the state of the player
	playerLoc = myMap.getLocation(this);
	//step timer(?)
	if(!playerLoc.equals(myMap.getLocation(this))){
		playerLoc = myMap.getLocation(this);
		//update location of player inside controller to pass to map
		
//			if(playerLoc.equals(base y of platform + 1)){
//				boolean isJump = false;
//			}
//		else if(playerLoc > base y of map){
//			boolean isJump = true;
		}
	} 
	
	

}

public void jump(){
//if(playerLoc.equals(base value y of map){
//	boolean isJump = false;
//}else boolean isJump = true;
}

public boolean getJump(){
return isJump;
}

public Location getLoc(){
return playerLoc;
}

//public void putSelfInGrid(Map grid, Location loc){
//myMap.put(loc, new Player(Checkpoint.getLastCheck(), false, myMap));
//}
public void removeSelfFromGrid(Map grid){
grid.remove(playerLoc);
}
}


