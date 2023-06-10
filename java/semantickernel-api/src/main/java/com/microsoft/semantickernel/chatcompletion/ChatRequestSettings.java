// Copyright (c) Microsoft. All rights reserved.
package com.microsoft.semantickernel.chatcompletion;

import com.microsoft.semantickernel.semanticfunctions.PromptTemplateConfig;
import com.microsoft.semantickernel.textcompletion.CompletionRequestSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * Settings for a chat completion request
 */
public class ChatRequestSettings extends CompletionRequestSettings {

  public ChatRequestSettings(
      double temperature,
      double topP,
      double presencePenalty,
      double frequencyPenalty,
      int maxTokens,
      List<String> stopSequences) {
    super(temperature, topP, presencePenalty, frequencyPenalty, maxTokens, stopSequences);
  }

  public ChatRequestSettings() {
    super();
  }


  public static ChatRequestSettings fromCompletionConfig(
      PromptTemplateConfig.CompletionConfig config) {
    return new ChatRequestSettings(
        config.getTemperature(),
        config.getTopP(),
        config.getPresencePenalty(),
        config.getFrequencyPenalty(),
        config.getMaxTokens(),
        new ArrayList<>());
  }
}
