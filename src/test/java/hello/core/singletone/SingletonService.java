package hello.core.singletone;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}

// 처음 static으로 생성된 객체만 생성
// 접근은 오직 getInstance 메소드를 이용해서 가능
// 생성자는 private으로 해서 외부에서 객체를 또 생성할 가능성을 막는다.