/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef KAACLIENT_HPP_
#define KAACLIENT_HPP_

#include "kaa/IKaaClient.hpp"

#include "kaa/ClientStatus.hpp"
#include "kaa/event/EventManager.hpp"
#include "kaa/schema/ISchemaProcessor.hpp"
#include "kaa/profile/IProfileManager.hpp"
#include "kaa/bootstrap/IBootstrapManager.hpp"
#include "kaa/event/gen/EventFamilyFactory.hpp"
#include "kaa/profile/ProfileManager.hpp"
#include "kaa/configuration/IConfigurationProcessor.hpp"
#include "kaa/notification/NotificationManager.hpp"
#include "kaa/schema/storage/ISchemaPersistenceManager.hpp"
#include "kaa/configuration/manager/IConfigurationManager.hpp"
#include "kaa/event/registration/EndpointRegistrationManager.hpp"
#include "kaa/configuration/delta/manager/DefaultDeltaManager.hpp"
#include "kaa/ClientStatus.hpp"
#include "kaa/configuration/storage/IConfigurationPersistenceManager.hpp"
#include "kaa/channel/IKaaChannelManager.hpp"
#include "kaa/channel/BootstrapDataProcessor.hpp"
#include "kaa/channel/OperationsDataProcessor.hpp"
#include "kaa/channel/impl/DefaultBootstrapChannel.hpp"
#include "kaa/channel/impl/DefaultOperationTcpChannel.hpp"
#include "kaa/log/LogCollector.hpp"

namespace kaa {

typedef boost::shared_ptr<IBootstrapManager> IBootstrapManagerPtr;
typedef boost::shared_ptr<DefaultDeltaManager> DefaultDeltaManagerPtr;

typedef enum {
    EXTERNAL_TRANSPORT_CONTROL = 0x1
} kaa_options_t;

class KaaClient : public IKaaClient {
public:
    KaaClient();
    virtual ~KaaClient() { }

    void init(int options);
    void start();
    void stop();

    virtual IProfileManager&                    getProfileManager() { return *profileManager_; }
    virtual ISchemaPersistenceManager&          getSchemaPersistenceManager() { return *schemaPersistenceManager_; }
    virtual IConfigurationPersistenceManager&   getConfigurationPersistenceManager() { return *configurationPersistenceManager_; }
    virtual IDeltaManager&                      getDeltaManager() { return *deltaManager_; }
    virtual IConfigurationManager&              getConfigurationManager() { return *configurationManager_; }
    virtual INotificationManager&               getNotificationManager() { return *notificationManager_; }
    virtual IEndpointRegistrationManager&       getEndpointRegistrationManager() { return *registrationManager_; }
    virtual EventFamilyFactory&                 getEventFamilyFactory() { return *eventFamilyFactory_; }
    virtual IEventListenersResolver&            getEventListenersResolver() { return *eventManager_; }
    virtual IKaaChannelManager&                 getChannelManager()  { return *channelManager_; }
    virtual const KeyPair&                      getClientKeyPair() { return clientKeys_; }
    virtual ILogCollector&                      getLogCollector() { return *logCollector_; }
    virtual IKaaDataMultiplexer&                getOperationMultiplexer() { return *operationsProcessor_; }
    virtual IKaaDataDemultiplexer&              getOperationDemultiplexer() { return *operationsProcessor_; }
    virtual IKaaDataMultiplexer&                getBootstrapMultiplexer() { return *bootstrapProcessor_; }
    virtual IKaaDataDemultiplexer&              getBootstrapDemultiplexer() { return *bootstrapProcessor_; }
private:
    void initKaaConfiguration();
    void initKaaTransport();
    void initClientKeys();

    void setDefaultConfiguration();

private:
    IKaaClientStateStoragePtr                       status_;
    IBootstrapManagerPtr                            bootstrapManager_;
    boost::scoped_ptr<ProfileManager>               profileManager_;
    boost::scoped_ptr<NotificationManager>          notificationManager_;
    boost::scoped_ptr<EndpointRegistrationManager>  registrationManager_;

    KeyPair         clientKeys_;
    std::string     publicKeyHash_;

    ISchemaProcessorPtr                   schemaProcessor_;
    DefaultDeltaManagerPtr                deltaManager_;
    IConfigurationManagerPtr              configurationManager_;
    IConfigurationProcessorPtr            configurationProcessor_;
    ISchemaPersistenceManagerPtr          schemaPersistenceManager_;
    IConfigurationPersistenceManagerPtr   configurationPersistenceManager_;
    boost::scoped_ptr<EventManager>       eventManager_;
    boost::scoped_ptr<EventFamilyFactory> eventFamilyFactory_;
    boost::scoped_ptr<IKaaChannelManager> channelManager_;
    boost::scoped_ptr<BootstrapDataProcessor>   bootstrapProcessor_;
    boost::scoped_ptr<OperationsDataProcessor>  operationsProcessor_;

    boost::shared_ptr<DefaultBootstrapChannel>          bootstrapChannel_;
    boost::shared_ptr<DefaultOperationTcpChannel>       opsTcpChannel_;

    boost::scoped_ptr<LogCollector>      logCollector_;

    int options_;
};

}



#endif /* KAACLIENT_HPP_ */
