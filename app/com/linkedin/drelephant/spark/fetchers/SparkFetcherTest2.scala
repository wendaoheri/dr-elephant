package com.linkedin.drelephant.spark.fetchers

import com.linkedin.drelephant.analysis.{AnalyticJob, ApplicationType}
import com.linkedin.drelephant.configurations.aggregator.AggregatorConfigurationData
import com.linkedin.drelephant.configurations.fetcher.FetcherConfigurationData
import com.linkedin.drelephant.spark.SparkMetricsAggregator
import com.linkedin.drelephant.spark.data.SparkApplicationData

/**
  * SparkFetcherTest2
  *
  * @author Sean
  */
object SparkFetcherTest2 extends App {

  val params = new java.util.HashMap[String, String]()
  params.put("event_log_location_uri", "http://10.17.183.85:18080")
  params.put("use_rest_for_eventlogs", "true")

  val config = new FetcherConfigurationData("",new ApplicationType("SPARK"),params)

  val sparkFetcher = new SparkFetcher(config)
  val analyticJob: AnalyticJob = new AnalyticJob;
  analyticJob.setAppId("application_1547807373099_1539786")
  val sparkApplicationData: SparkApplicationData = sparkFetcher.fetchData(analyticJob)

  params.put("allocated_memory_waste_buffer_percentage","0.5")
  val ac: AggregatorConfigurationData = new AggregatorConfigurationData("",new ApplicationType("SPARK"),params)
  val sma = new SparkMetricsAggregator(ac)
  sma.aggregate(sparkApplicationData)
  val result = sma.getResult()

  result

}
