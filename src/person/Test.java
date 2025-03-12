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
		
		taro.phoneNumber = "080-1234-5678";
		jiro.phoneNumber = "070-5678-1234";
		hanako.phoneNumber = "050-1234-5678";
		nozomi.phoneNumber = "090-5678-1234";
		
		taro.address = "東京";
		jiro.address = "埼玉";
		hanako.address = "千葉";
		nozomi.address = "神奈川";
		
		taro.jouhou();
		taro.talk();
		taro.walk();
		taro.run();
		}
	}
		
		