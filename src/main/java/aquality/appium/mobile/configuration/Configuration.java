package aquality.appium.mobile.configuration;

import aquality.selenium.core.configurations.IElementCacheConfiguration;
import aquality.selenium.core.configurations.ILoggerConfiguration;
import aquality.selenium.core.configurations.IRetryConfiguration;
import aquality.selenium.core.configurations.ITimeoutConfiguration;
import com.google.inject.Inject;

public class Configuration implements IConfiguration {

    private final ITimeoutConfiguration timeoutConfiguration;
    private final IRetryConfiguration retryConfiguration;
    private final IApplicationProfile applicationProfile;
    private final ILoggerConfiguration loggerConfiguration;
    private final IElementCacheConfiguration elementCacheConfiguration;

    @Inject
    public Configuration(ITimeoutConfiguration timeoutConfiguration, IRetryConfiguration retryConfiguration,
                         IApplicationProfile applicationProfile, ILoggerConfiguration loggerConfiguration,
                         IElementCacheConfiguration elementCacheConfiguration) {
        this.timeoutConfiguration = timeoutConfiguration;
        this.retryConfiguration = retryConfiguration;
        this.applicationProfile = applicationProfile;
        this.loggerConfiguration = loggerConfiguration;
        this.elementCacheConfiguration = elementCacheConfiguration;
    }

    @Override
    public IApplicationProfile getApplicationProfile() {
        return applicationProfile;
    }

    @Override
    public ITimeoutConfiguration getTimeoutConfiguration() {
        return timeoutConfiguration;
    }

    @Override
    public IRetryConfiguration getRetryConfiguration() {
        return retryConfiguration;
    }

    @Override
    public ILoggerConfiguration getLoggerConfiguration() {
        return loggerConfiguration;
    }

    @Override
    public IElementCacheConfiguration getElementCacheConfiguration() {
        return elementCacheConfiguration;
    }
}