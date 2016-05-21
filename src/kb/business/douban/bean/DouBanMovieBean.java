/**
 * @Title        DouBanMovieBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影Bean
 *
 * @author       Will
 * @designer     none
 * @reviewer     none
 * @version      1.0,2015年11月28日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2015年11月28日 Will Created
 ****************
 *               1.1,2015年11月28日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2015 Will. All rights reserved.
 */
package kb.business.douban.bean;

/**
 * @ClassName:   DouBanMovieBean
 * @Description: 豆瓣电影Bean
 * @author       Will
 * @date         2015年11月28日 下午6:29:05
 *
 */
public class DouBanMovieBean {

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("制片国家：");
		for(String str : countries) {
			if(str == countries[0]){
				sb.append(str);
			} else {
				sb.append("，" + str);
			}
		}
		sb.append("\r\n导演：");
		for(DouBanMovieCelebrityShortBean director : directors) {
			if(director == directors[0]){
				sb.append(director);
			} else {
				sb.append("，" + director);
			}
		}
		sb.append("\r\n影片类型：");
		for(String str : genres) {
			if(str == genres[0]){
				sb.append(str);
			} else {
				sb.append("，" + str);
			}
		}
		sb.append("\r\n主演：");
		for(DouBanMovieCelebrityShortBean cast : casts) {
			if(cast == casts[0]){
				sb.append(cast);
			} else {
				sb.append("，" + cast);
			}
		}
		sb.append("\r\n简介：" + summary + "\r\n");
		return sb.toString();
	}

	/**
	 * @Fields id : 条目id
	 */
	private String id;
	/**
	 * @Fields title : 中文名
	 */
	private String title;
	/**
	 * @Fields original_title : 原名
	 */
	private String original_title;
	/**
	 * @Fields aka : 又名 
	 */
	private String aka[];
	/**
	 * @Fields alt : 条目页URL
	 */
	private String alt;
	/**
	 * @Fields mobile_url : 移动版条目页URL
	 */
	private String mobile_url;
	/**
	 * @Fields rating : 评分
	 */
	private DouBanMovieRatingBean rating;
	/**
	 * @Fields ratings_count : 评分人数
	 */
	private int ratings_count;
	/**
	 * @Fields wish_count : 想看人数
	 */
	private int wish_count;
	/**
	 * @Fields collect_count : 看过人数
	 */
	private int collect_count;
	/**
	 * @Fields do_count : 在看人数，如果是电视剧，默认值为0，如果是电影值为null
	 */
	private int do_count;
	/**
	 * @Fields images : 电影海报图
	 */
	private DouBanMovieImagesBean images;
	/**
	 * @Fields subtype : 条目分类, movie或者tv
	 */
	private String subtype;
	/**
	 * @Fields directors : 导演
	 */
	private DouBanMovieCelebrityShortBean directors[];
	/**
	 * @Fields casts : 主演
	 */
	private DouBanMovieCelebrityShortBean casts[];
	/**
	 * @Fields douban_site : 豆瓣小站
	 */
	private String douban_site;
	/**
	 * @Fields year : 年代
	 */
	private String year;
	/**
	 * @Fields genres : 影片类型，最多提供3个
	 */
	private String genres[];
	/**
	 * @Fields countries : 制片国家/地区
	 */
	private String countries[];
	/**
	 * @Fields summary : 简介
	 */
	private String summary;
	/**
	 * @Fields comments_count : 短评数量
	 */
	private int comments_count;
	/**
	 * @Fields reviews_count : 影评数量
	 */
	private int reviews_count;
	/**
	 * @Fields seasons_count : 总季数(tv only)
	 */
	private int seasons_count;
	/**
	 * @Fields current_season : 当前季数(tv only)
	 */
	private int current_season;
	/**
	 * @Fields episodes_count : 当前季的集数(tv only) 
	 */
	private int episodes_count;
	/**
	 * @Fields schedule_url : 影讯页URL(movie only)
	 */
	private String schedule_url;
	
	/**
	 * 创建一个新的实例 DouBanMovieBean.
	 *
	 */
	public DouBanMovieBean() {
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return original_title
	 */
	public String getOriginal_title() {
		return original_title;
	}

	/**
	 * @param original_title the original_title to set
	 */
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	/**
	 * @return aka
	 */
	public String[] getAka() {
		return aka;
	}

	/**
	 * @param aka the aka to set
	 */
	public void setAka(String[] aka) {
		this.aka = aka;
	}

	/**
	 * @return alt
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * @param alt the alt to set
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}

	/**
	 * @return mobile_url
	 */
	public String getMobile_url() {
		return mobile_url;
	}

	/**
	 * @param mobile_url the mobile_url to set
	 */
	public void setMobile_url(String mobile_url) {
		this.mobile_url = mobile_url;
	}

	/**
	 * @return rating
	 */
	public DouBanMovieRatingBean getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(DouBanMovieRatingBean rating) {
		this.rating = rating;
	}

	/**
	 * @return ratings_count
	 */
	public int getRatings_count() {
		return ratings_count;
	}

	/**
	 * @param ratings_count the ratings_count to set
	 */
	public void setRatings_count(int ratings_count) {
		this.ratings_count = ratings_count;
	}

	/**
	 * @return wish_count
	 */
	public int getWish_count() {
		return wish_count;
	}

	/**
	 * @param wish_count the wish_count to set
	 */
	public void setWish_count(int wish_count) {
		this.wish_count = wish_count;
	}

	/**
	 * @return collect_count
	 */
	public int getCollect_count() {
		return collect_count;
	}

	/**
	 * @param collect_count the collect_count to set
	 */
	public void setCollect_count(int collect_count) {
		this.collect_count = collect_count;
	}

	/**
	 * @return do_count
	 */
	public int getDo_count() {
		return do_count;
	}

	/**
	 * @param do_count the do_count to set
	 */
	public void setDo_count(int do_count) {
		this.do_count = do_count;
	}

	/**
	 * @return images
	 */
	public DouBanMovieImagesBean getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(DouBanMovieImagesBean images) {
		this.images = images;
	}

	/**
	 * @return subtype
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * @param subtype the subtype to set
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * @return directors
	 */
	public DouBanMovieCelebrityShortBean[] getDirectors() {
		return directors;
	}

	/**
	 * @param directors the directors to set
	 */
	public void setDirectors(DouBanMovieCelebrityShortBean[] directors) {
		this.directors = directors;
	}

	/**
	 * @return casts
	 */
	public DouBanMovieCelebrityShortBean[] getCasts() {
		return casts;
	}

	/**
	 * @param casts the casts to set
	 */
	public void setCasts(DouBanMovieCelebrityShortBean[] casts) {
		this.casts = casts;
	}

	/**
	 * @return douban_site
	 */
	public String getDouban_site() {
		return douban_site;
	}

	/**
	 * @param douban_site the douban_site to set
	 */
	public void setDouban_site(String douban_site) {
		this.douban_site = douban_site;
	}

	/**
	 * @return year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return genres
	 */
	public String[] getGenres() {
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	/**
	 * @return countries
	 */
	public String[] getCountries() {
		return countries;
	}

	/**
	 * @param countries the countries to set
	 */
	public void setCountries(String[] countries) {
		this.countries = countries;
	}

	/**
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return comments_count
	 */
	public int getComments_count() {
		return comments_count;
	}

	/**
	 * @param comments_count the comments_count to set
	 */
	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}

	/**
	 * @return reviews_count
	 */
	public int getReviews_count() {
		return reviews_count;
	}

	/**
	 * @param reviews_count the reviews_count to set
	 */
	public void setReviews_count(int reviews_count) {
		this.reviews_count = reviews_count;
	}

	/**
	 * @return seasons_count
	 */
	public int getSeasons_count() {
		return seasons_count;
	}

	/**
	 * @param seasons_count the seasons_count to set
	 */
	public void setSeasons_count(int seasons_count) {
		this.seasons_count = seasons_count;
	}

	/**
	 * @return current_season
	 */
	public int getCurrent_season() {
		return current_season;
	}

	/**
	 * @param current_season the current_season to set
	 */
	public void setCurrent_season(int current_season) {
		this.current_season = current_season;
	}

	/**
	 * @return episodes_count
	 */
	public int getEpisodes_count() {
		return episodes_count;
	}

	/**
	 * @param episodes_count the episodes_count to set
	 */
	public void setEpisodes_count(int episodes_count) {
		this.episodes_count = episodes_count;
	}

	/**
	 * @return schedule_url
	 */
	public String getSchedule_url() {
		return schedule_url;
	}

	/**
	 * @param schedule_url the schedule_url to set
	 */
	public void setSchedule_url(String schedule_url) {
		this.schedule_url = schedule_url;
	}

}
