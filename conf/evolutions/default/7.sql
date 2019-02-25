CREATE TABLE yarn_app_summary (
    id VARCHAR(50) NOT NULL,
    user VARCHAR(50),
    name VARCHAR(100),
    queue VARCHAR(100),
    state VARCHAR(20),
    final_status VARCHAR(20),
    progress INT(4),
    tracking_ui VARCHAR(20),
    tracking_url VARCHAR(255),
    diagnostics VARCHAR(100),
    cluster_id BIGINT,
    application_Type VARCHAR(20),
    application_tags VARCHAR(100),
    started_time BIGINT,
    finished_time BIGINT,
    elapsed_time BIGINT,
    am_container_logs VARCHAR(255),
    am_host_http_address VARCHAR(100),
    allocated_mb BIGINT,
    allocated_vcores BIGINT,
    running_containers INT,
    memory_seconds BIGINT,
    vcore_seconds BIGINT,
    preempted_resource_mb BIGINT,
    preempted_resource_vcores BIGINT,
    num_non_amcontainer_preempted INT,
    num_amcontainer_preempted INT,
    log_aggregation_status VARCHAR(100),
    PRIMARY KEY (id)
);
create index yarn_app_summary_i1 on yarn_app_summary (finished_time);
create index yarn_app_summary_i2 on yarn_app_summary (user,finished_time);
create index yarn_app_summary_i3 on yarn_app_summary (application_type,user,finished_time);
create index yarn_app_summary_i4 on yarn_app_summary (started_time);