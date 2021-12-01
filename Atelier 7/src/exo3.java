import atelier07.Cercle;
import cours04.FigureGeometrique;

public class Cercle extends FigureGeometrique implements Comparable {

	protected float rayon = 0;

	public Cercle(float r) {
		super("noir");
		rayon = r;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Cercle c = (Cercle)arg0;
		if (c.rayon < rayon) return 1;
		if (c.rayon > rayon) return -1;
		return 0;
	}

	public float perimetre() {
		// TODO Auto-generated method stub
		return 0;
		return (float)(2*Math.PI*rayon);
	}

	public float surface() {
		// TODO Auto-generated method stub
		return 0;
		return (float)(Math.PI*rayon*rayon);
	}

}
}
