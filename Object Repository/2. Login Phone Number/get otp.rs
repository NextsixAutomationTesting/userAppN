<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>get otp</name>
   <tag></tag>
   <elementGuidId>99deb397-7f19-4bae-ba7b-89185a357cf9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n      \&quot;dataSource\&quot;: \&quot;ClusterSIT\&quot;,\n      \&quot;database\&quot;: \&quot;trrappdb\&quot;,\n      \&quot;collection\&quot;: \&quot;otps\&quot;,\n      \&quot;pipeline\&quot;:[\n        {\n            \&quot;$match\&quot;:{\&quot;mobile\&quot;:\&quot;60178454122\&quot;}\n\n        },\n\n          {\n            \n              \&quot;$sort\&quot;:{\&quot;created\&quot;: -1}\n          },\n              {\&quot;$limit\&quot;:1}\n      ]\n\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>api-key</name>
      <type>Main</type>
      <value>AKAFnW5WgyyOq3F3S2lVPcRhZr12qxZTTPjz0Llu1myg9jUSNjaVaGih51BZ8n60</value>
      <webElementGuid>d815a465-0f8d-4459-8738-4996f6a1d0c9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://data.mongodb-api.com/app/data-nnnyp/endpoint/data/beta/action/aggregate</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
