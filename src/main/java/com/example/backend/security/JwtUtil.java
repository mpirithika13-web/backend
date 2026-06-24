
// package com.example.backend.security;

// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;

// import java.util.Date;

// import io.jsonwebtoken.security.Keys;
// import java.security.Key;
// import org.springframework.stereotype.Component;

// @Component
// public class JwtUtil {

// //     private static final String SECRET_KEY =
// //             "trello_secret_key";


// private final Key SECRET = Keys.hmacShaKeyFor("mySecurityKeymySecuritykeymySecurityKey".getBytes());
//     public String generateToken(String email) {

//         return Jwts.builder()
//                 .setSubject(email)
//                 .setIssuedAt(new Date())
//                 .setExpiration(
//                         new Date( System.currentTimeMillis()
//                                         + 1000 * 60 * 60))
//                 .signWith(SignatureAlgorithm.HS256,SECRET)
//                 .compact();
//     }

    
// }