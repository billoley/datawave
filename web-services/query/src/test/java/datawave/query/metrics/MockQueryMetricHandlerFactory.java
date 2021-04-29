package datawave.query.metrics;

import datawave.microservice.querymetric.QueryMetric;
import datawave.webservice.query.metric.QueryMetricHandler;

/**
 * When instantiated via PowerMock through a test instance of MockShardTableQueryMetricHandler, creates a mock instance of QueryMetricHandler. Otherwise,
 * creates a null QueryMetricHandler.
 */
public class MockQueryMetricHandlerFactory {
    public QueryMetricHandler<QueryMetric> newMockQueryMetricHandler() {
        return null;
    }
}
