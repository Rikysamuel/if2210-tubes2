package VideoPlayer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gdata.client.youtube.YouTubeQuery;
import com.google.gdata.client.youtube.YouTubeService;
import com.google.gdata.data.ILink;
import com.google.gdata.data.youtube.VideoEntry;
import com.google.gdata.data.youtube.VideoFeed;
import com.google.gdata.util.ServiceException;

public class YoutubeDataRetriever {

	/**
	 * @param args
	 */
	private final String clientID = "370897670752.apps.googleusercontent.com";
	private YouTubeService service;
	public YoutubeDataRetriever()
	{
		System.setProperty("http.proxyHost", "http://cache.itb.ac.id");
		System.setProperty("http.proxyPort", "8080");
		service = new YouTubeService(clientID);
		service.setConnectTimeout(5000); // millis	
	}
	public String GetAbsoluteId(String URL)
	{
	    String txt=URL;
	    String re1="(http)";	// Word 1
	    String re2="(:)";	// Any Single Character 1
	    String re3="(\\/)";	// Any Single Character 2
	    String re4="(\\/)";	// Any Single Character 3
	    String re5="(www\\.youtube\\.com)";	// Fully Qualified Domain Name 1
	    String re6="(\\/)";	// Any Single Character 4
	    String re7="(v)";	// Variable Name 1
	    String re8="(\\/)";	// Any Single Character 5
	    String re9="((?:[a-z][a-z0-9_]*))";	// Variable Name 2
	    String re10="(&)";	// Any Single Character 6
	    String re11="(feature)";	// Word 2
	    String re12="(=)";	// Any Single Character 7
	    String re13="(youtube_gdata_player)";	// Variable Name 3
	    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7+re8+re9+re10+re11+re12+re13,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	    Matcher m = p.matcher(txt);
	    if (m.find())
	    {
	    	return m.group(9);	        
	    }
	    else
	    {
	    	return new String();
	    }
	}
	public long getView(String URL) throws IOException, ServiceException
	{
		YouTubeQuery query = new YouTubeQuery(new URL("http://gdata.youtube.com/feeds/api/videos"));
		query.setFullTextQuery(GetAbsoluteId(URL));
		VideoFeed videoFeed = service.query(query, VideoFeed.class);
		List<VideoEntry>ListVideo =  videoFeed.getEntries();
		return ListVideo.get(0).getStatistics().getViewCount()+ListVideo.get(0).getStatistics().getFavoriteCount();
	}
	public String getTitle(String URL) throws IOException, ServiceException
	{
		YouTubeQuery query = new YouTubeQuery(new URL("http://gdata.youtube.com/feeds/api/videos"));
		query.setFullTextQuery(GetAbsoluteId(URL));
		VideoFeed videoFeed = service.query(query, VideoFeed.class);
		List<VideoEntry>ListVideo =  videoFeed.getEntries();
		return ListVideo.get(0).getTitle().getPlainText();
	}
}
