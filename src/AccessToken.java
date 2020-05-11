/*

### JWT
JSON Web Token (JWT) is a JSON-based open standard (RFC 7519) for creating tokens that assert some number of claims. For example, a server could generate a token that has the claim `logged in as admin` and provide that to a client.

### Client Token
The `ClientToken` is an older token that also outputs a JWT. It can give access to an outgoing client identified by a `clientName` and `applicationSid`. It can give access to an incoming client by a `clientName`. It can also allow you to subscribe to events of the issuer. All capabilities are then combined into the `scope` of the payload. The payload below has access to an outgoing client and the event stream.

The header of a `ClientToken` consists of 2 fields:
* `alg` - algorithm used to encode the token
* `typ` - type of the token
```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```

The payload of a `ClientToken` consists of the following:
* `iss` - issuer of the token
* `exp` - expiry date of the token in seconds from epoch
* `scope` - space separated string of the scopes that the token can access
```json
{
  "iss": "ac123",
  "scope": "scope:stream:subscribe?path=%2F2010-04-01%2FEvents scope:client:outgoing?clientName=foobar",
  "exp": 1471900064
}
```

Encoded JWT
```
eyJhbGciOiAiSFMyNTYiLCAidHlwIjogIkpXVCJ9.eyJpc3MiOiAiYWMxMjMiLCAic2NvcGUiOiAic2NvcGU6c3RyZWFtOnN1YnNjcmliZT9wYXRoPSUyRjIwMTAtMDQtMDElMkZFdmVudHMmcGFyYW1zPWJhciUzRGJheiBzY29wZTpjbGllbnQ6b3V0Z29pbmc_Y2xpZW50bmFtZT1mb29iYXIiLCAiZXhwIjogMTQ3MTkwMDA2NH0.BGuqB1qEJPrO6QwVgPvmIzPCKYOU_cUtvhFD0zMpIKU
```

## Problem
Your task is to get accustomed to the JWT. From there you will write a test harness around the `ClientToken` and find any bugs that may exist.

*/

public class AccessToken {
}
