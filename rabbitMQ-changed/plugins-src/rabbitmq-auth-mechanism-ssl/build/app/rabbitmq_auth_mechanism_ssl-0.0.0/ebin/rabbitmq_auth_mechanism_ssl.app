{application,rabbitmq_auth_mechanism_ssl,
             [{description,"RabbitMQ SSL authentication (SASL EXTERNAL)"},
              {vsn,"0.0.0"},
              {modules,[rabbit_auth_mechanism_ssl,
                        rabbit_auth_mechanism_ssl_app]},
              {registered,[]},
              {mod,{rabbit_auth_mechanism_ssl_app,[]}},
              {env,[]},
              {applications,[kernel,stdlib]}]}.
