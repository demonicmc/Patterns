package com.company.bridges;

/**
 * Created by root on 04.05.17.
 */
public class DetectiveImpl  implements Detective {


    private  BasicSocialWeb faceBookSocialWeb =
            new FacebookSocialWeb();
    private  ExtendedSocialWeb extendedSocialWeb =
            new ExtendedSocialWebAdapter(faceBookSocialWeb);

    private  BasicSocialWeb VkSocialWeb =
            new FacebookSocialWeb();
    private  ExtendedSocialWeb vkSocialWeb =
            new ExtendedSocialWebAdapter(VkSocialWeb);


    @Override
    public void makerDossierVK(String date, int id) {

        vkSocialWeb.getHistory(id, date);
        extendedSocialWeb.

    }

    @Override
    public void makerDossierFaceBook(String date, int id) {
        extendedSocialWeb.getHistory(id,date);
        extendedSocialWeb.getLikes();
    }
}
