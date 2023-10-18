package bjut.utils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Date;

public class TokenUtils {
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    public static final String  SIGN ="fwafew";
    public static boolean verify(String token, String username) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SIGN);
            JWTVerifier verifier = JWT.require(algorithm)  //创建验证对象
                    .withClaim("username", username)
                    .build();
            // 解析jwt（token）
            DecodedJWT jwt = verifier.verify(token);


            return true;
        } catch (Exception exception) {
            return false;
        }
    }
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String sign(String username) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(SIGN);
        // 附带username信息
        return JWT.create()
                .withClaim("username", username)//负载可以加入用户信息
                .withExpiresAt(date)//过期事件
                .sign(algorithm);//加密
}}
