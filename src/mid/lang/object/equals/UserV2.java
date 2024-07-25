package mid.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    // 동등성 비교를 위해 equals 재정의
//    @Override
//    public boolean equals(Object obj){
//        UserV2 user = (UserV2) obj;  // 다운캐스팅
//        return id.equals(user.id);
//    }


    // 정확한 equals 구현! -> IDE가 생성해줌
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
