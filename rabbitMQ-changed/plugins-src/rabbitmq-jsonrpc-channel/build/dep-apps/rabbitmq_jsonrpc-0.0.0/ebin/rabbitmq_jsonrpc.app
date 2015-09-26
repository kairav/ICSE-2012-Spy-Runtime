{application,rabbitmq_jsonrpc,
             [{description,"Rabbit JSON-RPC"},
              {vsn,"0.0.0"},
              {modules,[rabbit_jsonrpc]},
              {registered,[]},
              {mod,{rabbit_jsonrpc,[]}},
              {env,[]},
              {applications,[kernel,stdlib,rabbitmq_mochiweb,
                             rfc4627_jsonrpc]}]}.
