package be_study.quiz.quiz53_0;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;

public class Quiz53_0 {
    public static void main(String[] args) throws IOException, ParseException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=fe127a6410ed26aaa1688b317964eed61b149e2238e5e181510537df1d0ae3b9"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode("2026-07-28", "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        
        JSONParser parser = new JSONParser();

        JSONObject root = (JSONObject) parser.parse(sb.toString());

        JSONObject response = (JSONObject) root.get("response");

        JSONObject body = (JSONObject) response.get("body");

        JSONArray items = (JSONArray) body.get("items");
        
        //System.out.println(items);
        for (Object obj : items) {

            JSONObject item = (JSONObject) obj;

            AirQualityDTO dto = new AirQualityDTO();

            dto.setPresnatnDt((String) item.get("presnatnDt"));
            dto.setFrcstOneDt((String) item.get("frcstOneDt"));
            dto.setFrcstOneCn((String) item.get("frcstOneCn"));
            dto.setFrcstTwoDt((String) item.get("frcstTwoDt"));
            dto.setFrcstTwoCn((String) item.get("frcstTwoCn"));

            AirQualityDAO dao = new AirQualityDAO();

            int result = dao.saveAirQuality(dto);

            System.out.println(result);
        }
    }
}