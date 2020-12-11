# Description:
#   Translate a give word/sentence into Slack Alphabet
#
# Dependencies:
#   None
#
# Commands:
#   hubot translate <text> - translates the <text>

_ = require 'lodash'

module.exports = (robot) ->

  robot.respond /translate (.*)/i, (res) ->
    robot.logger.info "Got sentence to translate: #{res.match[1]}"

    word = res.match[1]
    translated = for char in word
      lowered = char.toLowerCase()
      if lowered == ' '
        char
      else
        ":alphabet-white-#{_.deburr lowered}:"

    msg = translated.reduce (x, y) -> x + y
    robot.logger.info "Translated: #{msg}"

    response =
      type: "mrkdwn"
      text: msg

    res.send response
