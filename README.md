# ratchet-chat
chatting testing
             'methods' => [
                                    "register" => '{command: "register", userId: 9}',
                                    "subscribe" => '{command: "subscribe", channel: "global"}',
                                    "groupchat" => '{command: "groupchat", message: "hello glob", channel: "global", id : 37, crypt : "asdfasdf"}',
                                    "message" => '{command: "message", to: "1", message: "it needs xss protection"}', //one to one
                                   
                                ],
