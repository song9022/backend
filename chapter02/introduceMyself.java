package chapter02;

public class introduceMyself {
	public static void main(String[] args) {
		// 자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력
		// 목적 : 변수를 선언하고 사용
		// boolean, int, double, String 활용
		
		//자기 소개
		String name = "강송이";
		int tall = 172;
		String phoneNumber = "010-0000-0000";
		
		// 좋아하는 것 1
		String favSinger = "이태민";
		String belong = "SHNee";
		int debutDay = 20080525;
		int debutSoloDay = 20140815;
		String debutSong = "누난 너무 예뻐";
		String debutSoloSong = "괴도";
		int taeminTall = 174;
		
		// 좋아하는 것 2
		String favDrink = "커피";
		String favDrink2 = "우유";
		boolean caffeineINCoffee = true;
		boolean caffeineINMilk = false;
		double coffeeContent = 0.44;
		int antipathy = 6;
		
		// 좋아하는 것 3
		String favAnimal = "고양이";
		String favAnimal2 = "뱀";
		boolean catMammalia = true;
		boolean snakeMammalia = false;
		
		// 좋아하는 것 4
		String favColor = "초록색";
		int jade1 = 131, jade2 = 220, jade3 = 183;
		int darkgreen1 = 33, darkgreen2 = 72, darkgreen3 = 50;
		double emeraldHardness = 7.5;
		int emeraldDiscovery = 1650;
		
		// 좋아하는 것 5
		String favAct = "뮤지컬";
		String favMu = "지킬 앤 하이드";
		int showRepeat = 9, intermission = 20, runningTime=170;
		
		// 취미
		String hobby = "영화보기";
		String favMovie = "해리포터 시리즈";
		int release = 2001, last = 2011, productionCost = 160000000, totalRunningTime = 1446;
		
		//자기소개
//		System.out.println(); 엔터로 개행
		System.out.println("만나서 반갑습니다. 저의 이름은 "+name+"입니다.");
//		System.out.print(); 개행 없음
		System.out.print("만나서 반갑습니다. 저의 이름은 ");
		System.out.print(name);
		System.out.print("입니다.");
		// 개행을 위해 추가
		System.out.println();
		System.out.println("키는 "+tall+"cm"); // 키
		System.out.println("전화번호는 "+phoneNumber+"입니다."); //전화번호
		
		// 좋아하는 것 1
		System.out.println("좋아하는 가수는 "+favSinger+"입니다.");
		System.out.println("소속된 그룹은 "+belong+"이며,");
		System.out.println("데뷔 날짜는 "+debutDay);
		System.out.println("솔로 데뷔 날짜는 "+debutSoloDay+"입니다.");
		System.out.println("그룹 데뷔곡은  "+debutSong+"이지만");
		System.out.println("솔로 데뷔곡은  "+debutSoloSong+"입니다.");
		System.out.println("그의 키는  "+taeminTall+"cm 라고 합니다.");
		
		// 좋아하는 것 2
		System.out.println("제가 좋아하는 음료는 "+favDrink+"와 "+favDrink2+"입니다.");
		System.out.println("현대 사람들은 건강 때문에 카페인에 신경을 많이 쓰는데요");
		System.out.println("그 중 "+favDrink+"에는 카페인이 있을까요?");
		System.out.println("답은  "+caffeineINCoffee+"입니다.");
		System.out.println(favDrink+"안에는  평균 "+coffeeContent+"mg만큼의 카페인이 들어있다고 해요.");
		System.out.println(favDrink+"의 반감기는 대략 "+antipathy+"시간 정도라고 합니다.");
		System.out.println("그렇다면 "+favDrink2+"에는 카페인이 있을까요?");
		System.out.println("답은  "+caffeineINMilk+"입니다.");
		
		// 좋아하는 것 3
		System.out.println("제가 좋아하는 동물에는"+favAnimal+"와 "+favAnimal2+"이 있습니다.");
		System.out.println("그 중 "+favAnimal+"는 포유류일까요?");
		System.out.println("답은  "+catMammalia+"입니다.");
		System.out.println("그 중 "+favAnimal2+"은 포유류일까요?");
		System.out.println("답은  "+snakeMammalia+"입니다.");
		System.out.println("둘의 종은 다르지만 각자 다른 매력을 가지고 있습니다.");
		
		// 좋아하는 것 4
		System.out.println("좋아하는 색은"+favColor+"입니다.");
		System.out.println("모든 초록색을 좋아하지만 가장 좋아하는 색의 RGB코드는 "+jade1+"."+jade2+"."+jade3+"입니다.");
		System.out.println("그다음으로 좋아하는 색의 RGB코드는 "+darkgreen1+"."+darkgreen2+"."+darkgreen3+"입니다.");
		System.out.println("좋아하는 색의 보석인 에메랄드의 굳기는 "+emeraldHardness+"정도입니다.");
		System.out.println("에메랄드의 첫 발견은 기원전 "+emeraldDiscovery+"년 이집트에서 이루어졌다 합니다.");
		
		// 좋아하는 것 5
		System.out.println("좋아하는 것들 중 하나엔"+favAct+"감상도 있습니다.");
		System.out.println("가장 좋아하는 뮤지컬은"+favMu+"입니다.");
		System.out.println("국내에서 "+favMu+"번 올라올 정도의 인기작입니다.");
		System.out.println("러닝타임은 인터미션 "+intermission+"분을 포함하여 총"+runningTime+"분 입니다.");

		
		//취미
		System.out.println("취미는 "+hobby+"입니다.");
		System.out.println("가장 좋아하는 영화는 "+favMovie+"입니다.");
		System.out.println("처음 "+release+"년에 개봉하여");
		System.out.println("마지막 "+last+"년 마지막 영화가 올라올 때까지 거의 매해 즐겁게 봤던 기억이 납니다.");
		System.out.println("제작비 "+productionCost+"달러의 판타지 영화는 정말 감명깊었습니다.");
		System.out.println(totalRunningTime+"분의 상영시간만큼 즐거운 추억이 가득했던 기억이 납니다.");
	
		
	}

}
