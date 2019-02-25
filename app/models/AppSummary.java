package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import play.db.ebean.Model;

@Entity
@Table(name = "yarn_app_summary")
public class AppSummary extends Model {

  @Id
  @Column(length = 50, unique = true, nullable = false)
  private String id;

  @Column(length = 100)
  private String user;

  @Column(length = 100)
  private String name;

  @Column(length = 100)
  private String queue;

  @Column(length = 20)
  private String state;

  @Column(length = 20)
  private String finalStatus;

  @Column
  private int progress;

  @Column(length = 20)
  private String trackingUI;

  @Column(length = 100)
  private String trackingUrl;

  @Column(length = 100)
  private String diagnostics;

  @Column
  private long clusterId;

  @Column(length = 20)
  private String applicationType;

  @Column(length = 100)
  private String applicationTags;

  @Column
  private long startedTime;

  @Column
  private long finishedTime;

  @Column
  private int elapsedTime;

  @Column(length = 100)
  private String amContainerLogs;

  @Column(length = 100)
  private String amHostHttpAddress;

  @Column
  private long allocatedMB;

  @Column
  private long allocatedVCores;

  @Column
  private int runningContainers;

  @Column
  private long memorySeconds;

  @Column
  private long vcoreSeconds;

  @Column
  private long preemptedResourceMB;

  @Column
  private long preemptedResourceVCores;

  @Column
  private int numNonAMContainerPreempted;

  @Column
  private int numAMContainerPreempted;

  @Column(length = 100)
  private String logAggregationStatus;


  public String getId() {
    return id;
  }

  public String getUser() {
    return user;
  }

  public String getName() {
    return name;
  }

  public String getQueue() {
    return queue;
  }

  public String getState() {
    return state;
  }

  public String getFinalStatus() {
    return finalStatus;
  }

  public int getProgress() {
    return progress;
  }

  public String getTrackingUI() {
    return trackingUI;
  }

  public String getTrackingUrl() {
    return trackingUrl;
  }

  public String getDiagnostics() {
    return diagnostics;
  }

  public long getClusterId() {
    return clusterId;
  }

  public String getApplicationType() {
    return applicationType;
  }

  public String getApplicationTags() {
    return applicationTags;
  }

  public long getStartedTime() {
    return startedTime;
  }

  public long getFinishedTime() {
    return finishedTime;
  }

  public int getElapsedTime() {
    return elapsedTime;
  }

  public String getAmContainerLogs() {
    return amContainerLogs;
  }

  public String getAmHostHttpAddress() {
    return amHostHttpAddress;
  }

  public long getAllocatedMB() {
    return allocatedMB;
  }

  public long getAllocatedVCores() {
    return allocatedVCores;
  }

  public int getRunningContainers() {
    return runningContainers;
  }

  public long getMemorySeconds() {
    return memorySeconds;
  }

  public long getVcoreSeconds() {
    return vcoreSeconds;
  }

  public long getPreemptedResourceMB() {
    return preemptedResourceMB;
  }

  public long getPreemptedResourceVCores() {
    return preemptedResourceVCores;
  }

  public int getNumNonAMContainerPreempted() {
    return numNonAMContainerPreempted;
  }

  public int getNumAMContainerPreempted() {
    return numAMContainerPreempted;
  }

  public String getLogAggregationStatus() {
    return logAggregationStatus;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setFinalStatus(String finalStatus) {
    this.finalStatus = finalStatus;
  }

  public void setProgress(int progress) {
    this.progress = progress;
  }

  public void setTrackingUI(String trackingUI) {
    this.trackingUI = trackingUI;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public void setDiagnostics(String diagnostics) {
    this.diagnostics = diagnostics;
  }

  public void setClusterId(long clusterId) {
    this.clusterId = clusterId;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }

  public void setApplicationTags(String applicationTags) {
    this.applicationTags = applicationTags;
  }

  public void setStartedTime(long startedTime) {
    this.startedTime = startedTime;
  }

  public void setFinishedTime(long finishedTime) {
    this.finishedTime = finishedTime;
  }

  public void setElapsedTime(int elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public void setAmContainerLogs(String amContainerLogs) {
    this.amContainerLogs = amContainerLogs;
  }

  public void setAmHostHttpAddress(String amHostHttpAddress) {
    this.amHostHttpAddress = amHostHttpAddress;
  }

  public void setAllocatedMB(long allocatedMB) {
    this.allocatedMB = allocatedMB;
  }

  public void setAllocatedVCores(long allocatedVCores) {
    this.allocatedVCores = allocatedVCores;
  }

  public void setRunningContainers(int runningContainers) {
    this.runningContainers = runningContainers;
  }

  public void setMemorySeconds(long memorySeconds) {
    this.memorySeconds = memorySeconds;
  }

  public void setVcoreSeconds(long vcoreSeconds) {
    this.vcoreSeconds = vcoreSeconds;
  }

  public void setPreemptedResourceMB(long preemptedResourceMB) {
    this.preemptedResourceMB = preemptedResourceMB;
  }

  public void setPreemptedResourceVCores(long preemptedResourceVCores) {
    this.preemptedResourceVCores = preemptedResourceVCores;
  }

  public void setNumNonAMContainerPreempted(int numNonAMContainerPreempted) {
    this.numNonAMContainerPreempted = numNonAMContainerPreempted;
  }

  public void setNumAMContainerPreempted(int numAMContainerPreempted) {
    this.numAMContainerPreempted = numAMContainerPreempted;
  }

  public void setLogAggregationStatus(String logAggregationStatus) {
    this.logAggregationStatus = logAggregationStatus;
  }
}
