public class Checkpoint implements Encounterable {
private Location lastCheck = null;
private Checkpoint cPoint;
public Checkpoint(Location last){
cPoint = new Checkpoint(last);
lastCheck = last;
}

public void updateLastCheck(Player player)
{
if(player.getLoc().equals(lastCheck))
{
	lastCheck = player.getLoc();
	cPoint = new Checkpoint(new Location(lastCheck.getRow(), lastCheck.getCol() + 30));
}
}
public Location getLastCheck()
{
return lastCheck;
}

@Override
public void putSelfInGrid(Map grid, Location loc) {
	// TODO Auto-generated method stub
	
}
}


