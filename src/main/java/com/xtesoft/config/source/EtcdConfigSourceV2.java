package com.xtesoft.config.source;

import com.xtesoft.config.source.client.EtcdHttpClient;
import org.eclipse.microprofile.config.spi.ConfigSource;
import org.jboss.logging.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EtcdConfigSourceV2 implements ConfigSource {
    private String baseUrl;
    private EtcdHttpClient client;
    private static final Logger LOG = Logger.getLogger(EtcdConfigSourceV2.class);
    private Map<String, String> configuration = new HashMap<>();

    public EtcdConfigSourceV2(String baseUrl) {
        this.baseUrl = baseUrl;
        this.client = new EtcdHttpClient(this.baseUrl);
        init();
    }

    private void init(){
        this.client.getKeys().getNode().getNodes()
                .stream().forEach(c-> {
                    LOG.info(c.getKey()+" : "+c.getValue());
                    configuration.put(c.getKey().replaceAll("/",""),c.getValue());
                });
    }

    @Override
    public Set<String> getPropertyNames() {
        return configuration.keySet();
    }

    @Override
    public int getOrdinal() {
        return 275;
    }

    @Override
    public String getValue(String key) {
        return configuration.get(key);
    }

    @Override
    public String getName() {
        return EtcdConfigSourceV2.class.getSimpleName();
    }
}
