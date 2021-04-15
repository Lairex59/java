
public class QuadratProgramm
{

	public static void main(String[] args) {
		Quadrat[] q1 = new Quadrat[50];

		int index = 0;
		double nummer = 0;

		for (int i = 0; i < q1.length; i++) {
			q1[i] = new Quadrat();
			q1[i].setSeiteA(Math.random() * (10));
			if (q1[i].getSeiteA() - nummer > 0) {
				nummer = q1[i].getSeiteA();
				index = i;
			}
		}
		System.out.println(q1[index].toString());
	}

}
