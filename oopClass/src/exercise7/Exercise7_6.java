package exercise7;

import java.util.*;

class Location{
	private String name;
	private int longitude; // 경도
	private int latitude; // 위도
	
	public Location(String name, int longitude, int latitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLatitude() {
		return latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> info = new HashMap<String, Location>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");

		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ", ");
			String name = st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());
			
			Location location = new Location(name, longitude, latitude);
			info.put(name, location);
		}
		
		Set<String> key = info.keySet(); // 해시맵 info에 있는 모든 키 set 컬렉션 리턴
		Iterator<String> it = key.iterator(); // Set을 순차검색하는 iterator 리턴
		System.out.println("----------------------------------");
		while(it.hasNext()) {
			String name = it.next();
			Location location = info.get(name); // 이름을 키로하여 객체를 얻음
			System.out.print(location.getName() + " ");
			System.out.print(location.getLongitude() + " ");
			System.out.println(location.getLatitude() + " ");
		}
		System.out.println("----------------------------------");
		
		while(true) {
			System.out.print("도시 이름 >>");
			String name = scanner.nextLine();
			if(name.equals("그만")) {
				break;
			}
			
			Location location = info.get(name); // 해시맵에서 이름을 키로 검색
			if(location == null) {
				System.out.println(name + "는 없습니다.");
			}
			else { // 해시맵에서 검색된 Student 객체
				System.out.print(location.getName() + " ");
				System.out.print(location.getLongitude() + " ");
				System.out.println(location.getLatitude() + " ");
			}
		}
		scanner.close();
	}
}