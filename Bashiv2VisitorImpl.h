#ifndef _BASHI_V2_VISITOR_IMPL_
#define _BASHI_V2_VISITOR_IMPL_

#include "Bashiv2BaseVisitor.h"
#include "Bashiv2Parser.h"

#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"

#include <algorithm>
#include <any>
#include <iostream>
#include <llvm/ADT/StringRef.h>
#include <llvm/IR/Function.h>
#include <llvm/IR/Instructions.h>
#include <llvm/IR/Type.h>
#include <llvm/Support/raw_ostream.h>
#include <map>
#include <memory>
#include <string>
#include <system_error>

class BashiV2VisitorImpl : Bashiv2BaseVisitor {
public:
  BashiV2VisitorImpl()
      : context(std::make_unique<llvm::LLVMContext>()),
        module(std::make_unique<llvm::Module>("BashiV2", *context)),
        builder(std::make_unique<llvm::IRBuilder<>>(*context)) {}

  virtual antlrcpp::Any visitScript(Bashiv2Parser::ScriptContext *ctx) override;
  virtual antlrcpp::Any visitCommand(Bashiv2Parser::CommandContext *ctx) override;
  virtual antlrcpp::Any visitSimpleCommand(Bashiv2Parser::SimpleCommandContext *ctx) override;
  //faltan funciones

  void generateLLVMCode() {
    std::error_code error;
    llvm::raw_fd_stream outLL("output.ll", error);
    module->print(outLL, nullptr);
  }

private:
  std::map<std::string, std::any> memory;
  std::unique_ptr<llvm::LLVMContext> context;
  std::unique_ptr<llvm::Module> module;
  std::unique_ptr<llvm::IRBuilder<>> builder;

};

#endif
