package com.xtesoft.config.source.factory;

import com.xtesoft.config.source.EtcdConfigSourceV2;
import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import io.smallrye.config.ConfigValue;
import org.eclipse.microprofile.config.spi.ConfigSource;
import java.util.Collections;
import java.util.OptionalInt;

public class EtcdConfigSourceFactory implements ConfigSourceFactory {
    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context) {
        final ConfigValue value = context.getValue("etcd.url");
        if(value==null || value.getValue()==null){
            return Collections.emptyList();
        }
        try{
            return Collections.singletonList(new EtcdConfigSourceV2(value.getValue()));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public OptionalInt getPriority() {
        return OptionalInt.of(275);
    }
}
