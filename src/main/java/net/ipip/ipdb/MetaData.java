package net.ipip.ipdb;

import java.util.Map;

import com.alibaba.fastjson2.annotation.JSONField;

/**
 * @copyright IPIP.net
 */
public class MetaData {
    @JSONField(name="build")
    public int Build;
    @JSONField(name="ip_version")
    public int IPVersion;
    @JSONField(name="node_count")
    public int nodeCount;
    @JSONField(name="languages")
    public Map<String, Integer> Languages;
    @JSONField(name="fields")
    public String[] Fields;
    @JSONField(name="total_size")
    public int totalSize;
}