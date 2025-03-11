package person;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Person taro = new Person();
		Person jiro = new Person();
		Person hanako = new Person();
		Person nozomi = new Person();
		
		taro.name = "山田太郎";
		jiro.name = "木村次郎";
		hanako.name = "鈴木花子";
		nozomi.name = "渡辺のぞみ";
		
		taro.age = 20;
		jiro.age = 18;
		hanako.age = 16;
		nozomi.age = 28;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(nozomi.name);
		System.out.println(nozomi.age);
		
}
}
