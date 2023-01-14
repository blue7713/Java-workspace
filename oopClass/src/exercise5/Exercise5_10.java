package exercise5;

abstract class PairMap{
	protected String keyArray[]; // key 들을 저장하는 배열
	protected String valueArray[]; // value 들을 저장하는 배열
	abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value); // key 와 value를 쌍으로 저장. 
												// 기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{
	private int num; // 배열의 크기 지정
	
	public Dictionary(int n) { // 배열의 크기를 받아 생성
		num = 0;
		keyArray = new String[n];
		valueArray = new String[n];
	}

	@Override
	String get(String key) { // key 값을 가진 value 리턴, 없으면 null 리턴
		for(int i = 0; i < num; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) { // key와 value를 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
		for(int i = 0; i < num; i++) {
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		valueArray[num] = value;
		keyArray[num++] = key;
		return;
		}

	@Override
	String delete(String key) { // key값을 가진 아이템(value와 함께) 삭제, 삭제된 value값 리턴
		String deleteDate = null;
		for(int i = 0; i < num; i++) {
			if(keyArray[i].equals(key)) {
				deleteDate = valueArray[i];
				for(int j = i; j < num - 1; j++) {
					valueArray[i] = valueArray[j + 1];
					keyArray[j] = keyArray[j + 1];
				}
				num--;
			}
		}
		return deleteDate;
	}

	@Override
	int length() { // 현재 저장된 아이템의 개수 리턴
		return num;
	}
}

public class Exercise5_10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문")); // 이재문 아이템 출력
		System.out.println("황기태의 값은 " + dic.get("황기태")); // 황기태 아이템 출력
		dic.delete("황기태"); // 황기태 아이템 삭제
		System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
	}
}