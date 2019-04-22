package user.subham.newsnips.Interface;

import user.subham.newsnips.Common.Common;
import user.subham.newsnips.Model.News;
import user.subham.newsnips.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
