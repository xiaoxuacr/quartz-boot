package com.xbd.quartz.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sys.quartz")
public class QuartzProperties {

    private ThreadPool threadPool = new ThreadPool();
    private Scheduler scheduler = new Scheduler();

    public QuartzProperties() {

    }

    public ThreadPool getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public static class ThreadPool {
        private int corePoolSize = 10;

        private int maxPoolSize = 20;

        private int queueCapacity = 50;

        public int getCorePoolSize() {
            return corePoolSize;
        }

        public void setCorePoolSize(int corePoolSize) {
            this.corePoolSize = corePoolSize;
        }

        public int getMaxPoolSize() {
            return maxPoolSize;
        }

        public void setMaxPoolSize(int maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
        }

        public int getQueueCapacity() {
            return queueCapacity;
        }

        public void setQueueCapacity(int queueCapacity) {
            this.queueCapacity = queueCapacity;
        }
    }

    public static class Scheduler {
        private Resource configLocation;

        private String schedulerName;

        private String ApplicationContextSchedulerContextKey = "applicationContext";

        private boolean overwriteExistingJobs = true;

        private boolean autoStartup = true;

        private int StartupDelay = 5;

        public Resource getConfigLocation() {
            return configLocation;
        }

        public void setConfigLocation(Resource configLocation) {
            this.configLocation = configLocation;
        }

        public String getSchedulerName() {
            return schedulerName;
        }

        public void setSchedulerName(String schedulerName) {
            this.schedulerName = schedulerName;
        }

        public String getApplicationContextSchedulerContextKey() {
            return ApplicationContextSchedulerContextKey;
        }

        public void setApplicationContextSchedulerContextKey(String applicationContextSchedulerContextKey) {
            ApplicationContextSchedulerContextKey = applicationContextSchedulerContextKey;
        }

        public boolean isOverwriteExistingJobs() {
            return overwriteExistingJobs;
        }

        public void setOverwriteExistingJobs(boolean overwriteExistingJobs) {
            this.overwriteExistingJobs = overwriteExistingJobs;
        }

        public boolean isAutoStartup() {
            return autoStartup;
        }

        public void setAutoStartup(boolean autoStartup) {
            this.autoStartup = autoStartup;
        }

        public int getStartupDelay() {
            return StartupDelay;
        }

        public void setStartupDelay(int startupDelay) {
            StartupDelay = startupDelay;
        }

    }

}