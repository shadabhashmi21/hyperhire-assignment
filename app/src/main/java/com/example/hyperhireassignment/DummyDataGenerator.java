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

        userModel = new UserModel(R.mipmap.profile_image, "안녕 나 응애", true, "1일전", "165cm", "53kg", true, "어머 제가 있던 테이블이 제일 반응이 좋았나보네요🤭 \n우짤래미님도 아시겠지만 저도 일반인 몸매 그 이상도 이하도 \n아니잖아요?! 그런 제가 기꺼이 도전해봤는데 생각보다 \n괜찮았어요! 오늘 중으로 라이브 리뷰 올라온다고 하니 \n꼭 봐주세용~!");

        UserModel commentUserModel = new UserModel(R.mipmap.secondary_profile_image, "ㅇㅅㅇ", false, "1일전", null, null, false, "오 대박! 라이브 리뷰 오늘 올라온대요? 챙겨봐야겠다");
        commentModel = new CommentModel(commentUserModel, true, 5, 1685818293);

        List<CommentModel> comments = new ArrayList<>();
        comments.add(commentModel);

        List<String> hashTagList = new ArrayList<>();
        hashTagList.add("#2023");
        hashTagList.add("#TODAYISMONDAY");
        hashTagList.add("#TOP");
        hashTagList.add("#POPS!");
        hashTagList.add("#WOW");
        hashTagList.add("#ROW");

        return new PostModel("지난 월요일에 했던 이벤트 중 가장 괜찮은 상품 뭐야?", "지난 월요일에 2023년 S/S 트렌드 알아보기 이벤트 참석했던 팝들아~ \n혹시 어떤 상품이 제일 괜찮았어? \n후기 올라오는거 보면 로우라이즈? 그게 제일 반응 좋고 그 테이블이 \n제일 재밌었다던데 맞아??? \n올해 로우라이즈가 트렌드라길래 나도 도전해보고 싶은데 말라깽이가 \n아닌 사람들도 잘 어울릴지 너무너무 궁금해ㅜㅜ로우라이즈 테이블에 \n있었던 팝들 있으면 어땠는지 후기 좀 공유해주라~~!", hashTagList, "https://wjddnjs754.cafe24.com/web/product/small/202303/5b9279582db2a92beb8db29fa1512ee9.jpg", 5, true, 1685819008, comments, userModel);
    }


}