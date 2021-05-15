package arraylists;
//example of a generic class Pairs
public class Pairs <A, B>{
	private A x;
	private B y;
	public Pairs(A x, B y) {
		this.x=x;
		this.y=y;
	}
	public void getDescription() {
		System.out.println(x+ " and "+ y);
	}
}
