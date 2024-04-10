package com.ylch.test.jdk_class_test.hashcode_equal;

import java.util.Objects;

/**
 * @author Mr.Yang
 * @desc MultiKey
 * @date 2023/3/20 18:44
 */
public class MultiKey {

    private final Integer mediaId;
    private final Long id;
    private final String platformAccountId;

    public MultiKey(Integer mediaId, Long id, String platformAccountId) {
        this.mediaId = mediaId;
        this.id = id;
        this.platformAccountId = platformAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiKey multiKey = (MultiKey) o;
        return mediaId.equals(multiKey.mediaId) && id.equals(multiKey.id) && platformAccountId.equals(multiKey.platformAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaId, id, platformAccountId);
    }

    public static void main(String[] args) {
        MultiKey multiKey = new MultiKey(2, 1L, "33");
        MultiKey multiKe2 = new MultiKey(1, 1L, "33");

        System.out.println(multiKey.equals(multiKe2));

    }

}
