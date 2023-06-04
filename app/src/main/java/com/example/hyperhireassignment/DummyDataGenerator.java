package com.example.hyperhireassignment;

import com.example.hyperhireassignment.model.CommentModel;
import com.example.hyperhireassignment.model.PostModel;
import com.example.hyperhireassignment.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class DummyDataGenerator {


    public PostModel generatePost() {
        UserModel userModel;
        CommentModel commentModel;

        userModel = new UserModel(R.mipmap.profile_image, "안녕 나 응애", true, "1일전", "165cm", "53kg", true);

        UserModel commentUserModel = new UserModel(R.mipmap.secondary_profile_image, "ㅇㅅㅇ", false, "1일전", null, null, false);
        commentModel = new CommentModel(commentUserModel, true, 5, 1685818293);

        List<CommentModel> comments = new ArrayList<>();
        comments.set(0, commentModel);

        List<String> hashTagList = new ArrayList<>();
        hashTagList.set(0, "#2023");
        hashTagList.set(1, "#TODAYISMONDAY");
        hashTagList.set(2, "#TOP");
        hashTagList.set(3, "#POPS!");
        hashTagList.set(4, "#WOW");
        hashTagList.set(5, "#ROW");

        return new PostModel("지난 월요일에 했던 이벤트 중 가장 괜찮은 상품 뭐야?", "지난 월요일에 2023년 S/S 트렌드 알아보기 이벤트 참석했던 팝들아~ \n혹시 어떤 상품이 제일 괜찮았어? \n후기 올라오는거 보면 로우라이즈? 그게 제일 반응 좋고 그 테이블이 \n제일 재밌었다던데 맞아??? \n올해 로우라이즈가 트렌드라길래 나도 도전해보고 싶은데 말라깽이가 \n아닌 사람들도 잘 어울릴지 너무너무 궁금해ㅜㅜ로우라이즈 테이블에 \n있었던 팝들 있으면 어땠는지 후기 좀 공유해주라~~!", hashTagList, "https://wjddnjs754.cafe24.com/web/product/small/202303/5b9279582db2a92beb8db29fa1512ee9.jpg", 5, true, 1685819008, comments, userModel);
    }


}