/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.mina2.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.mina2.Mina2Component;
import org.apache.camel.component.mina2.Mina2TextLineDelimiter;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Socket level networking using TCP or UDP with the Apache Mina 2.x library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.mina2")
public class Mina2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the mina2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared mina configuration.
     */
    private Mina2ConfigurationNestedConfiguration configuration;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Mina2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            Mina2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class Mina2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.mina2.Mina2Configuration.class;
        /**
         * Protocol to use
         */
        private String protocol;
        /**
         * Hostname to use. Use localhost or 0.0.0.0 for local server as
         * consumer. For producer use the hostname or ip address of the remote
         * server.
         */
        private String host;
        /**
         * Port number
         */
        private Integer port;
        /**
         * Setting to set endpoint as one-way or request-response.
         */
        private Boolean sync = true;
        /**
         * Only used for TCP. If no codec is specified, you can use this flag to
         * indicate a text line based codec; if not specified or the value is
         * false, then Object Serialization is assumed over TCP.
         */
        private Boolean textline = false;
        /**
         * Only used for TCP and if textline=true. Sets the text line delimiter
         * to use. If none provided, Camel will use DEFAULT. This delimiter is
         * used to mark the end of text.
         */
        private Mina2TextLineDelimiter textlineDelimiter;
        /**
         * To use a custom minda codec implementation.
         */
        private ProtocolCodecFactory codec;
        /**
         * You can configure the encoding (a charset name) to use for the TCP
         * textline codec and the UDP protocol. If not provided, Camel will use
         * the JVM default Charset
         */
        private String encoding;
        /**
         * Maximum amount of time it should take to send data to the MINA
         * session. Default is 10000 milliseconds.
         */
        private Long writeTimeout = 10000L;
        /**
         * You can configure the timeout that specifies how long to wait for a
         * response from a remote server. The timeout unit is in milliseconds,
         * so 60000 is 60 seconds.
         */
        private Long timeout = 30000L;
        /**
         * Sessions can be lazily created to avoid exceptions, if the remote
         * server is not up and running when the Camel producer is started.
         */
        private Boolean lazySessionCreation = true;
        /**
         * Only used for TCP. You can transfer the exchange over the wire
         * instead of just the body. The following fields are transferred: In
         * body, Out body, fault body, In headers, Out headers, fault headers,
         * exchange properties, exchange exception. This requires that the
         * objects are serializable. Camel will exclude any non-serializable
         * objects and log it at WARN level.
         */
        private Boolean transferExchange = false;
        /**
         * To set the textline protocol encoder max line length. By default the
         * default value of Mina itself is used which are Integer.MAX_VALUE.
         */
        private Integer encoderMaxLineLength = -1;
        /**
         * To set the textline protocol decoder max line length. By default the
         * default value of Mina itself is used which are 1024.
         */
        private Integer decoderMaxLineLength = 1024;
        /**
         * You can enable the Apache MINA logging filter. Apache MINA uses slf4j
         * logging at INFO level to log all input and output.
         */
        private Boolean minaLogger = false;
        /**
         * You can set a list of Mina IoFilters to use.
         */
        private List filters;
        /**
         * The mina component installs a default codec if both, codec is null
         * and textline is false. Setting allowDefaultCodec to false prevents
         * the mina component from installing a default codec as the first
         * element in the filter chain. This is useful in scenarios where
         * another filter must be the first in the filter chain, like the SSL
         * filter.
         */
        private Boolean allowDefaultCodec = true;
        /**
         * Whether or not to disconnect(close) from Mina session right after
         * use. Can be used for both consumer and producer.
         */
        private Boolean disconnect = false;
        /**
         * If sync is enabled then this option dictates MinaConsumer if it
         * should disconnect where there is no reply to send back.
         */
        private Boolean disconnectOnNoReply = true;
        /**
         * If sync is enabled this option dictates MinaConsumer which logging
         * level to use when logging a there is no reply to send back.
         */
        private LoggingLevel noReplyLogLevel = LoggingLevel.WARN;
        /**
         * To configure SSL security.
         */
        private SSLContextParameters sslContextParameters;
        /**
         * Whether to auto start SSL handshake.
         */
        private Boolean autoStartTls = true;
        /**
         * Number of worker threads in the worker pool for TCP and UDP
         */
        private Integer maximumPoolSize = 16;
        /**
         * Whether to use ordered thread pool, to ensure events are processed
         * orderly on the same channel.
         */
        private Boolean orderedThreadPoolExecutor = true;
        /**
         * Whether to create the InetAddress once and reuse. Setting this to
         * false allows to pickup DNS changes in the network.
         */
        private Boolean cachedAddress = true;
        /**
         * If the clientMode is true, mina consumer will connect the address as
         * a TCP client.
         */
        private Boolean clientMode = false;

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Boolean getSync() {
            return sync;
        }

        public void setSync(Boolean sync) {
            this.sync = sync;
        }

        public Boolean getTextline() {
            return textline;
        }

        public void setTextline(Boolean textline) {
            this.textline = textline;
        }

        public Mina2TextLineDelimiter getTextlineDelimiter() {
            return textlineDelimiter;
        }

        public void setTextlineDelimiter(
                Mina2TextLineDelimiter textlineDelimiter) {
            this.textlineDelimiter = textlineDelimiter;
        }

        public ProtocolCodecFactory getCodec() {
            return codec;
        }

        public void setCodec(ProtocolCodecFactory codec) {
            this.codec = codec;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public Long getWriteTimeout() {
            return writeTimeout;
        }

        public void setWriteTimeout(Long writeTimeout) {
            this.writeTimeout = writeTimeout;
        }

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        public Boolean getLazySessionCreation() {
            return lazySessionCreation;
        }

        public void setLazySessionCreation(Boolean lazySessionCreation) {
            this.lazySessionCreation = lazySessionCreation;
        }

        public Boolean getTransferExchange() {
            return transferExchange;
        }

        public void setTransferExchange(Boolean transferExchange) {
            this.transferExchange = transferExchange;
        }

        public Integer getEncoderMaxLineLength() {
            return encoderMaxLineLength;
        }

        public void setEncoderMaxLineLength(Integer encoderMaxLineLength) {
            this.encoderMaxLineLength = encoderMaxLineLength;
        }

        public Integer getDecoderMaxLineLength() {
            return decoderMaxLineLength;
        }

        public void setDecoderMaxLineLength(Integer decoderMaxLineLength) {
            this.decoderMaxLineLength = decoderMaxLineLength;
        }

        public Boolean getMinaLogger() {
            return minaLogger;
        }

        public void setMinaLogger(Boolean minaLogger) {
            this.minaLogger = minaLogger;
        }

        public List getFilters() {
            return filters;
        }

        public void setFilters(List filters) {
            this.filters = filters;
        }

        public Boolean getAllowDefaultCodec() {
            return allowDefaultCodec;
        }

        public void setAllowDefaultCodec(Boolean allowDefaultCodec) {
            this.allowDefaultCodec = allowDefaultCodec;
        }

        public Boolean getDisconnect() {
            return disconnect;
        }

        public void setDisconnect(Boolean disconnect) {
            this.disconnect = disconnect;
        }

        public Boolean getDisconnectOnNoReply() {
            return disconnectOnNoReply;
        }

        public void setDisconnectOnNoReply(Boolean disconnectOnNoReply) {
            this.disconnectOnNoReply = disconnectOnNoReply;
        }

        public LoggingLevel getNoReplyLogLevel() {
            return noReplyLogLevel;
        }

        public void setNoReplyLogLevel(LoggingLevel noReplyLogLevel) {
            this.noReplyLogLevel = noReplyLogLevel;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Boolean getAutoStartTls() {
            return autoStartTls;
        }

        public void setAutoStartTls(Boolean autoStartTls) {
            this.autoStartTls = autoStartTls;
        }

        public Integer getMaximumPoolSize() {
            return maximumPoolSize;
        }

        public void setMaximumPoolSize(Integer maximumPoolSize) {
            this.maximumPoolSize = maximumPoolSize;
        }

        public Boolean getOrderedThreadPoolExecutor() {
            return orderedThreadPoolExecutor;
        }

        public void setOrderedThreadPoolExecutor(
                Boolean orderedThreadPoolExecutor) {
            this.orderedThreadPoolExecutor = orderedThreadPoolExecutor;
        }

        public Boolean getCachedAddress() {
            return cachedAddress;
        }

        public void setCachedAddress(Boolean cachedAddress) {
            this.cachedAddress = cachedAddress;
        }

        public Boolean getClientMode() {
            return clientMode;
        }

        public void setClientMode(Boolean clientMode) {
            this.clientMode = clientMode;
        }
    }
}