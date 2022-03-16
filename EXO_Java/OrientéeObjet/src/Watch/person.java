package Watch;

public class person {
	String name = null;
	boolean gotAWatch;
	private Watch wear = null;
	
public void getWatch(Watch w)
{

}
	
public void removeWatch(Watch w)
{
	wear = null;
	w.isWorn = false;
	w.ownerName = null;
}
}
