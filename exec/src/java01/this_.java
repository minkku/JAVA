package java01;

public class this_ {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		b1.appendModelName("(최신형)");
		System.out.println(b1.modelName);
	}
}
