package nl.hsac.fitnesse.fixture.slim;

import java.nio.charset.StandardCharsets;

public class ExtStringFixture extends StringFixture {

    public String cleanupUtf16String(String stringToConvert) {
        byte[] bArr = stringToConvert.substring(2).getBytes(StandardCharsets.UTF_8);
        return new String(bArr, StandardCharsets.UTF_16LE);
    }
}
